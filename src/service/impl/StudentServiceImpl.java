package service.impl;

import dao.StudentDAO;
import domain.Student;
import service.StudentService;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService {

    StudentDAO studentDAO = new StudentDAO();

    Scanner scanner = new Scanner(System.in);

    @Override
    public void getAllStudent() {
        List<Student> students = studentDAO.getAllStudents();
        students.forEach(System.out::println);
    }

    @Override
    public void getStudentById() {
        System.out.println("请输入要查询学生的学号");
        int i = scanner.nextInt();
        List<Student> student = studentDAO.getStudentById(i);
        System.out.println(student);
    }

    @Override
    public void getStudentsByClass() {
        System.out.println("请输入要查询的班级");
        String s = scanner.nextLine();
        List<Student> students = studentDAO.getStudentsByClass(s);
        students.forEach(System.out ::println);
    }

    @Override
    public void getStudentsByLikeName() {
        System.out.println("请输入要模糊查询的学生姓名");
        String s = scanner.nextLine();
        List<Student> students = studentDAO.getStudentsByLikeName(s);
        students.forEach(System.out ::println);
    }

    @Override
    public void getStudentsOrderByClassAndGrade() {
        List<Student> students = studentDAO.getStudentsOrderByClassAndGrade();
        students.forEach(System.out ::println);
    }

    @Override
    public void getAvgOrderByAvg() {
        List<String> avgOrderByAvg = studentDAO.getAvgOrderByAvg();
        avgOrderByAvg.forEach(System.out ::println);
    }

    @Override
    public void getMaxAndMin() {
        List<String> maxAndMin = studentDAO.getMaxAndMin();
        maxAndMin.forEach(System.out ::println);
    }

    @Override
    public void addStudent() {
        Student student = new Student();
        System.out.println("请输入学生学号");
        long id = scanner.nextInt();
        student.setId(id);
        System.out.println("请输入学生姓名");
        String name = scanner.next();
        student.setName(name);
        System.out.println("请输入学生性别(男：1，女：2)");
        int sex = scanner.nextInt();
        student.setSex(sex);
        System.out.println("请输入学生年龄");
        int age = scanner.nextInt();
        student.setAge(age);
        System.out.println("请输入学生班级");
        String classname = scanner.next();
        student.setClassname(classname);
        System.out.println("请输入学生成绩");
        int score = scanner.nextInt();
        student.setScore(score);
        System.out.println("请输入学生成绩等级");
        String grade = scanner.next();
        student.setGrade(grade);
        boolean result = studentDAO.addStudent(student);
        System.out.println(result);
    }

    @Override
    public void updateStudent() {
        System.out.println("请输入需要进行信息修改的学生学号");
        int id = scanner.nextInt();
        System.out.println("请输入需要进行信息修改的学生姓名");
        String name = scanner.next();
        studentDAO.updateStudent(id, name);
    }

    @Override
    public void deleteStudent() {
        System.out.println("请输入需要进行信息删除的学生学号");
        int id = scanner.nextInt();
        boolean result = studentDAO.deleteStudent(id);
    }
}
