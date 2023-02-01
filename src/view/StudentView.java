package view;

import service.StudentService;
import service.impl.StudentServiceImpl;

import java.util.Scanner;

public class StudentView {

    StudentServiceImpl studentServiceimpl =  new StudentServiceImpl();
    Scanner scanner = new Scanner(System.in);
    /**
     * 主界面
     */
    public void index(){
        System.out.println("*****主界面*****");
        System.out.println("1、查询学生信息");
        System.out.println("2、信息统计");
        System.out.println("3、信息管理");
        System.out.println("4、退出");
        System.out.println();
        System.out.println("请输入您的选择");
        int i = scanner.nextInt();
        if (i == 1){
            studentInfo();
            return;
        }
        if (i == 2) {
            infoTotal();
            return;
        }
        if (i == 3) {
            infoManage();
        }
        if (i == 4) {
            return;
        }
        while (true){
            index();
        }
    }

    /**
     * 查询学生信息界面
     */
    public void studentInfo(){
        System.out.println("*****查询学生信息界面");
        System.out.println("1、查询全部学生信息");
        System.out.println("2、按学号查询学生信息");
        System.out.println("3、按班级查询学生信息");
        System.out.println("4、按名字模糊查询学生信息");
        System.out.println("5、返回上一界面");
        System.out.println();
        System.out.println("请输入您的选择");
        int i = scanner.nextInt();
        if (i == 1){
            studentServiceimpl.getAllStudent();
            System.out.println();
            studentInfo();
            return;
        }
        if (i == 2) {
            studentServiceimpl.getStudentById();
            System.out.println();
            studentInfo();
            return;
        }
        if (i == 3) {
            studentServiceimpl.getStudentsByClass();
            System.out.println();
            studentInfo();
            return;
        }
        if (i == 4) {
            studentServiceimpl.getStudentsByLikeName();
            System.out.println();
            studentInfo();
            return;
        }
        if (i == 5) {
            index();
            return;
        }
        while (true){
            studentInfo();
        }
    }

    /**
     * 信息统计界面
     */
    public void infoTotal(){
        System.out.println("*****信息统计界面*****");
        System.out.println("1、按班级低到高，成绩高到低排序");
        System.out.println("2、统计每个班的平均分，高到低排序");
        System.out.println("3、统计每个班的最高分，最低分");
        System.out.println("4、返回上一界面");
        System.out.println();
        System.out.println("请输入您的选择");
        int i = scanner.nextInt();
        if (i == 1){
            studentServiceimpl.getStudentsOrderByClassAndGrade();
            System.out.println();
            infoTotal();
            return;
        }
        if (i == 2) {
            studentServiceimpl.getAvgOrderByAvg();
            System.out.println();
            infoTotal();
            return;
        }
        if (i == 3) {
            studentServiceimpl.getMaxAndMin();
            System.out.println();
            infoTotal();
            return;
        }
        if (i == 4) {
            index();
            return;
        }
        while (true){
            infoTotal();
        }
    }

    /**
     * 信息管理界面
     */
    public void infoManage(){
        System.out.println("****信息管理界面*****");
        System.out.println("1、增加学生");
        System.out.println("2、修改学生");
        System.out.println("3、删除学生");
        System.out.println("4、返回上一界面");
        System.out.println();
        System.out.println("请输入您的选择");
        int i = scanner.nextInt();
        if (i == 1){
            studentServiceimpl.addStudent();
            System.out.println();
            infoManage();
            return;
        }
        if (i == 2) {
            studentServiceimpl.updateStudent();
            System.out.println();
            infoManage();
            return;
        }
        if (i == 3) {
            studentServiceimpl.deleteStudent();
            System.out.println();
            infoManage();
            return;
        }
        if (i == 4) {
            index();
            return;
        }
        while (true){
            infoManage();
        }
    }
}
