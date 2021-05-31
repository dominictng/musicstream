package tp.edu.musicstream;

public class SongCollection
{
    private Song songs[] = new Song[3];

    public SongCollection()
    {
        Song theWayYouLookTonight = new Song("S1001",
                "1. The Way You Look Tonight",
                "Michael Buble",
                "https://p.scdn.co/mp3-preview/a5b8972e764025020625bbf9c1c2bbb06e394a60?cid=2afe87a64b0042dabf51f37318616965",
                4.66,
                R.drawable.michael_buble_collection);

        Song BillyJean = new Song("S1002",
                "2. Billy Jean",
                "Michael Jackson",
                "https://p.scdn.co/mp3-preview/14a1ddedf05a15ad0ac11ce28b40ea1a15fabd20?cid=2afe87a64b0042dabf51f37318616965",
                4.9,
                R.drawable.billie_jean);

        Song CheerfulSun = new Song("S1003", "Cheerful Sun", "DOVA-SYNDROME/MFP", "https://www.youtube.com/watch?v=zJYZwKPftH8&ab_channel=DOVA-SYNDROMEYouTubeOfficial", 2.28, R.drawable.dovasyndrome);

        songs[0] = theWayYouLookTonight;
        songs[1] = BillyJean;
        songs[2] = CheerfulSun;

    }


}
