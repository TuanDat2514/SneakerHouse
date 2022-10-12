 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sneakerHouse.sneakerHouse.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Cascade;

/**
 *
 * @author Admin
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_user;
    private String fullname;
    private String address;
    private Date birthday;
    private String phone;
    private int gender;
    private String email;
    private String username;
    private String password;
    private String role;
    
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,
        orphanRemoval = true)
    @JsonManagedReference
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Favorite> favorite ;

    public User(Long id_user, String fullname, String address, Date birthday, String phone, int gender, String email, String username, String password, String role, List<Favorite> favorite) {
        this.id_user = id_user;
        this.fullname = fullname;
        this.address = address;
        this.birthday = birthday;
        this.phone = phone;
        this.gender = gender;
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
        this.favorite = favorite;
    }

    public User() {
    }
     public void addFavorite(Favorite newFavorite) {
        favorite.add(newFavorite);
        newFavorite.setUser(this);
    }
     public void removeFavorite(Favorite deleteFavorite) {
        favorite.remove(deleteFavorite);
        deleteFavorite.setUser(null);
    }
    
    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Favorite> getFavorite() {
        return favorite;
    }

    public void setFavorite(List<Favorite> favorite) {
        this.favorite = favorite;
    }
    
    
}
