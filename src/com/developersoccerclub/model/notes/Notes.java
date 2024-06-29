/*

querys for postgres sgdb
.............................
select * from information_schema.tables where table_schema = 'public';
select * from tbplayer;

code part in Java Lang
... 001
public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DeveloperSoccerClubPU");
        
        Player player001 = new Player("Ronaldinho", "Bruxo", "888.888.888-88", "Atacante", 50000);
        Player player002 = new Player("Romário", "Baixinho", "147.888.888-88", "Atacante", 70000);
        Player player003 = new Player("Ronaldo", "Fenômeno", "888.978.888-14", "Atacante", 90000);
        Player player004 = new Player("Zico", "Galinho", "111.975.548-98", "Atacante", 65000);
        Player player005 = new Player("Bebeto", "Neto", "695.328.971-38", "Atacante", 53000);
        
        List<Player> players = new ArrayList<>();
        players.add(player001);
        players.add(player002);
        players.add(player003);
        players.add(player004);
        players.add(player005);
        
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        for(Player p : players) {
            em.persist(p);
        }
        
        em.getTransaction().commit();
        
        emf.close();
    }
...

*/
