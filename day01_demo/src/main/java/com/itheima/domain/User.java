package com.itheima.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class User {
    private Integer id;
    private  String name;
    private Date   birthday;
    private List<Integer> ids;
    private Map<String,Object> map;
    private  List<Address> addresses;
    private  Map<String,Address> mapAddress;

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Map<String, Address> getMapAddress() {
        return mapAddress;
    }

    public void setMapAddress(Map<String, Address> mapAddress) {
        this.mapAddress = mapAddress;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", ids=" + ids +
                ", map=" + map +
                ", addresses=" + addresses +
                ", mapAddress=" + mapAddress +
                '}';
    }
}
