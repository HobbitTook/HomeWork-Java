package qa.guru.repo;



import qa.guru.domain.Nurburgring;
import qa.guru.domain.Spa;
import qa.guru.domain.Track;

import java.util.Map;

public class TrackStore {

    private Map<String, Track> store = Map.of(
            "Nurburgring", new Nurburgring(),
            "Spa", new Spa()
    );

    public qa.guru.domain.Track lookup(String trackName) {
        for (String key : store.keySet()) {
            if (key.equalsIgnoreCase(trackName)) {
                return store.get(key);
            }
        }
        throw new IllegalArgumentException("Track not found for given name: " + trackName);
    }

    public Object[] trackInStore() {
        String[] keys = new String[store.size()];
        int index = 0;
        for (Map.Entry<String, Track> mapEntry : store.entrySet()) {
            keys[index] = mapEntry.getKey();
            index++;
        }
        return keys;
    }

    public void trackList() {
        System.out.println(store.keySet());
    }
}
