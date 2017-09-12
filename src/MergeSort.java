import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    private List<Integer> data;

    public MergeSort() {
        this.data = new ArrayList<>();
    }

    public void insert(int value) {
        this.data.add(value);
    }

    public void merge(List<Integer> workSpace, int low, int high, int upperBound) {
        int workSpaceIndex = 0; // This is most commonly j.
        int lowerBound = low;
        int mid = high - 1;
        int size = upperBound - lowerBound + 1;

        while (low <= mid && high <= upperBound) {
            if (this.data.get(low) < this.data.get(high)) {
                workSpace.set(workSpaceIndex++, this.data.get(low));
            } else {
                workSpace.set(workSpaceIndex++, this.data.get(high++));
            }
        }
    }
}
