class TimeMap {

    class Pair {
        int timestamp;
        String value;

        Pair(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    public Map<String, List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();

    }

    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<Pair>());
        map.get(key).add(new Pair(timestamp, value));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }

        List<Pair> list = map.get(key);
        int low = 0, high = list.size() - 1;
        String ans = "";

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (list.get(mid).timestamp <= timestamp) {
                ans = list.get(mid).value;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;

    }
}

