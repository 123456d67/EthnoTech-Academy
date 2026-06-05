public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> playlist = new java.util.ArrayList<>();
        playlist.add("animal");
        playlist.add("I am rider");
        playlist.add("jai lava kusa");    
        System.out.println("Playlist:"+playlist);
        System.out.println("frist list:"+playlist.get(0));
        System.out.println("second list:"+playlist.get(1));
        System.out.println("third list:"+playlist.get(2));
        playlist.remove(1);
        System.out.println("playlist after removal:"+playlist);
        playlist.get(1);
        System.out.println("size of the playlist:"+playlist.size());
        playlist.set(1,"Rama Rama");
        System.out.println("playlist after setting:"+playlist);
        for(String song:playlist)
        {
            System.out.println(song);
        }
    }
    
}
