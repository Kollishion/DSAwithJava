class MajorityElement {
    public int majorityElementFinder(int[] nums) {
        int cnt = 0;
        int elm = 0;
        for (int i = 0; i < nums.length; i++) {
            if (cnt == 0) {
                cnt = 1;
                elm = nums[i];
            } else if (nums[i] == elm) {
                cnt++;
            } else {
                cnt--;
            }
        }

        int cnt1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == elm) {
                cnt1++;
            }
        }
        if (cnt1 > (nums.length / 2)) {
            return elm;
        }
        return -1; 
    }

    public static void main(String[] args) {
        MajorityElement ob = new MajorityElement();
        System.out.println(ob.majorityElementFinder(new int[]{1, 5, 6, 4, 3, 3, 2, 2, 1, 4, 2}));
        System.out.println(ob.majorityElementFinder(new int[]{2, 2, 1, 2, 3, 2, 2}));
    }
}
