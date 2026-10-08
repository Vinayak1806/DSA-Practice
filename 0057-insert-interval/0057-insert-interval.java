class Solution {
    public int[][] insert(int[][] intervals, int[] newintervals) {

       int [][] temp = new int [intervals.length+1][2];

       
        int i = 0;
        while(i<intervals.length)
        {
            temp[i][0]=intervals[i][0];
            temp[i][1]=intervals[i][1];
            i++;
        }
        temp[temp.length-1][0]=newintervals[0];
        temp[temp.length-1][1]=newintervals[1];

        Arrays.sort(temp, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> list = new ArrayList<>();

        int start = temp[0][0];
        int end = temp[0][1];

        for(int j = 1;j<temp.length;j++)
        {
            if(temp[j][0]<= end)
            {
                end=Math.max(end,temp[j][1]);
            }
            else
            {
                list.add(new int[]{start, end});

                start=temp[j][0];
                end=temp[j][1];

            }
        }

        list.add(new int[]{start, end});

        return list.toArray(new int[list.size()][]);
    }
}