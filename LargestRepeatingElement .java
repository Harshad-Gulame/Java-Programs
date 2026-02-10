class LargestRepeatingElement {
    public static void main(String[] args) {

        int[] arr = {5, 3, 9, 1, 3, 9, 5, 9};
        boolean[] track = new boolean[arr.length];

        int largest = Integer.MIN_VALUE;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (track[i])
                continue;

            int cnt = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    track[j] = true;
                }
            }

            if (cnt > 1 && arr[i] > largest) {
                largest = arr[i];
                found = true;
            }
        }

        if (found)
            System.out.println("Largest Repeating Element: " + largest);
        else
            System.out.println("No repeating element found");
    }
}
