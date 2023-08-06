class Solution {
    public int numMusicPlaylists(int n, int goal, int k) {
        int[] memo=new int[n+1];
        int mod=1_000_000_007;
        for(int song=1;song<=goal;song++) {
            long diag = song==1 ? 1:0;
            for(int diffSongs=1;diffSongs<=n;diffSongs++) {
                long up=memo[diffSongs];
                // play a new music, this garantees its different from
                // the last k songs
                long sum=(diag*Math.max(0,n-diffSongs+1))%mod;
                // play a song that wasnt played in the last k songs:
                //   We know we have diffSongs differents songs and
                //   that k of this songs were played in the last k
                //   songs (because we know every one of those songs
                //   must be different otherwise the constraint k would
                //   have been disrispected), so we can choose (diffSongs-k)
                if(diffSongs>k) sum=(sum+up*(diffSongs-k))%mod;
                memo[diffSongs]=(int)sum;
                diag=up;
            }
        }
        return memo[n];
    }
}