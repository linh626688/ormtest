package game;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DangThanhLinh on 16/05/2017.
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    String username;
    String name;
    String email;
    String level;

    Hero hero1;
    Hero hero2;
    Hero hero3;
    Hero hero4;
    Hero hero5;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tutor")
    private List<Hero> postByTutor = new ArrayList<Hero>();


    public Hero getHero1() {
        return hero1;
    }

    public void setHero1(Hero hero1) {
        this.hero1 = hero1;
    }

    public Hero getHero2() {
        return hero2;
    }

    public void setHero2(Hero hero2) {
        this.hero2 = hero2;
    }

    public Hero getHero3() {
        return hero3;
    }

    public void setHero3(Hero hero3) {
        this.hero3 = hero3;
    }

    public Hero getHero4() {
        return hero4;
    }

    public void setHero4(Hero hero4) {
        this.hero4 = hero4;
    }

    public Hero getHero5() {
        return hero5;
    }

    public void setHero5(Hero hero5) {
        this.hero5 = hero5;
    }

    public List<Hero> getPostByTutor() {
        return postByTutor;
    }

    public void setPostByTutor(List<Hero> postByTutor) {
        this.postByTutor = postByTutor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
