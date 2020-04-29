import org.junit.Test;

import java.util.List;

public class test {
    @Test
    public void g1() {
        List<student> a = mybatisutils.getSqlSession().getMapper(jks.class).select1();
        mybatisutils.getSqlSession().commit();
        mybatisutils.close();
        System.out.println(a);
    }

    @Test
    public void g2() {
        student xs = new student();
        xs.setStu_id(0);
        boolean a = mybatisutils.getSqlSession().getMapper(jks.class).deletes(xs);
        mybatisutils.getSqlSession().commit();
        mybatisutils.close();
        System.out.println("返回结果：" + a);
    }

    @Test
    public void g3() {
        student sx = new student();
        sx.setStu_id(3);
        sx.setStu_nam("老仨");
        sx.setStu_sex("22");
        boolean us = mybatisutils.getSqlSession().getMapper(jks.class).update(sx);
        mybatisutils.getSqlSession().commit();
        mybatisutils.close();
        System.out.println(us);
    }

    @Test
    public void g4() {
        student sx = new student();
        for (int a=0;a<=10;a++){
            sx.setStu_id(a);
            sx.setStu_nam("老"+a);
            sx.setStu_sex("20");
            boolean ax = mybatisutils.getSqlSession().getMapper(jks.class).inertial1(sx);
            System.out.println("是否成功:" + ax);
        }
        mybatisutils.getSqlSession().commit();
        mybatisutils.close();
    }
    @Test
    public void g5(){
        List<student> a=mybatisutils.getSqlSession().getMapper(jks.class).select2(88);
        mybatisutils.getSqlSession().commit();
        mybatisutils.close();
        System.out.println(a);
    }
    @Test
    public void g6(){
        student sx = new student();
            sx.setStu_id(86);
            sx.setStu_nam("老");
            sx.setStu_sex("88");
            boolean ax = mybatisutils.getSqlSession().getMapper(jks.class).inertial1(sx);
            System.out.println("是否成功:" + ax);
        mybatisutils.getSqlSession().commit();
        mybatisutils.close();
    }
    @Test
    public void g7() {
        List<student> a = mybatisutils.getSqlSession().getMapper(jks.class).select3(9);
        mybatisutils.getSqlSession().commit();
        mybatisutils.close();
        System.out.println(a);
    }
}

