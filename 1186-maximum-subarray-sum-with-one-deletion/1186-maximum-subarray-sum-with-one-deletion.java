class Solution {
    public int maximumSum(int[] arr) {

        int onedelete = arr[0];
        int nodelete = arr[0];
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {

            int prenodelete = nodelete;
            int preonedelete = onedelete;

            nodelete = Math.max(nodelete + arr[i], arr[i]);

            onedelete = Math.max(preonedelete + arr[i] , prenodelete);

            result = Math.max(result, Math.max(onedelete, nodelete));
        }
        return result;
    }
}

