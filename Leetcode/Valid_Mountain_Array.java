class Solution {
    public boolean validMountainArray(int[] arr) {
        int art = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i-1]<arr[i] && art != 2)
                art=1;
            else if(arr[i-1]>arr[i] && art != 0)
                art=2;
            else
                return false;
        }
        if(art == 2)
            return true;
        else
            return false;
    }
}