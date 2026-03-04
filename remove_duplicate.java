class remove_duplicate {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        // k is the index for the next unique element position
        // We start at 0 because the first element is always unique
        int k = 0;

        for (int i = 1; i < nums.length; i++) {
            // If we find a value different from the current unique element
            if (nums[i] != nums[k]) {
                k++;           // Move to the next slot
                nums[k] = nums[i]; // Update the slot with the new unique value
            }
        }

        // The number of unique elements is the index k + 1
        return k + 1;
    }
}
