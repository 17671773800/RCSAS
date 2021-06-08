package com.hxf.control;

import com.hxf.coach.Coach;
import com.hxf.entity.DetailsOfSport;
import com.hxf.entity.SportsType;
import com.hxf.registeredSportSchedule.RegisteredSportSchedule;
import com.hxf.student.Student;

import java.io.*;
import java.util.*;

public class UserController extends Exception {
    static Scanner scanner = new Scanner(System.in);

    static File directory = new File("");
    // get project root directory
    static String courseFile;

    static String rootPath;

    static {
        try {
            courseFile = directory.getCanonicalPath()+"/src/com/hxf/txt/";
            rootPath = directory.getCanonicalPath()+"/";
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        List<Coach> list = getDetailsOfCoach();
        for(Coach coach : list){
            System.out.println(coach.toString());
        }

    }

    /**
     * login account
     */
    public static Map studentLogin(String userID, String password, int index) throws IOException {
        String userType = String.valueOf(index);
        // get student info
        List<Student> studentList = new ArrayList<Student>();
        String filePath = courseFile + "student.txt";
        List<String> studentTxt = readTxtFile(filePath);
        for (String ss : studentTxt) {
            if (ss.trim() != "" && !ss.trim().equals("")) {
                String[] ssArray = ss.split(",");
                Student student = new Student();
                student.setId(ssArray[0]);
                student.setPassword(ssArray[1]);
                student.setName(ssArray[2]);
                student.setAge(ssArray[3]);
                student.setCellPhoneNumber(ssArray[4]);
                student.setEmail(ssArray[5]);
                student.setType(ssArray[6]);
                studentList.add(student);
            }
        }

        boolean flag = true;
//        while (flag) {
            // enter account password
//            System.out.print("please enter account:");
//            String accout = scanner.nextLine();
//            System.out.print("please enter password:");
//            String password = scanner.nextLine();

            Student selfRecord = new Student();

            // check account password
            for (Student st : studentList) {
                if (st.getId().equals(userID) && st.getPassword().equals(password) && userType.equals(st.getType())
                ) {
                    flag = false;
                    selfRecord = st;
                }
            }

            Map map = new HashMap();
            map.put("boolean", flag);
            map.put("student", selfRecord);
            return map;
    }

    /**
     * if check student ID exist
     */
    public boolean ifStudentIDExist(String userID){
        // get student info
        List<Student> studentList = new ArrayList<Student>();
        String filePath = courseFile + "student.txt";
        List<String> studentTxt = readTxtFile(filePath);
        for (String ss : studentTxt) {
            if (ss.trim() != "" && !ss.trim().equals("")) {
                String[] ssArray = ss.split(",");
                Student student = new Student();
                student.setId(ssArray[0]);
                student.setPassword(ssArray[1]);
                student.setName(ssArray[2]);
                student.setAge(ssArray[3]);
                student.setCellPhoneNumber(ssArray[4]);
                student.setEmail(ssArray[5]);
                studentList.add(student);
            }
        }

        boolean flag = true;


        // check account password
        for (Student st : studentList) {
            if (st.getId().equals(userID)) {
                flag = false;
            }
        }

        return flag;
    }


    // register sport schedule
    public static void addSportSchedule(String sportScheduleString){
        String filePath = courseFile + "RegisteredSportSchedule.txt";
        writeFile(filePath, sportScheduleString);
    }

    // provide feedback
    public static void provideFeedbackAndStarToCoach(String feedback){
        String filePath = courseFile + "feedback.txt";
        writeFile(filePath, feedback);
    }

    // // get DetailsOfSport info
    public static List<DetailsOfSport> getDetailsOfSportList(){
        List<DetailsOfSport> detailsOfSportList = new ArrayList<>();
        String filePath = rootPath + "Sport.txt";
        List<String> sportType = readTxtFile(filePath);
        for (String ss : sportType) {
            if (ss.trim() != "" && !ss.trim().equals("")) {
                String[] ssArray = ss.split("\t");
                DetailsOfSport rss = new DetailsOfSport();
                rss.setSportId(ssArray[0]);
                rss.setSportName(ssArray[1]);
                rss.setSportCenterID(ssArray[2]);
                rss.setSportCenterID(ssArray[3]);
                rss.setSportCenterAddress(ssArray[4]);

                detailsOfSportList.add(rss);
            }
        }

        return detailsOfSportList;
    }
    // get all of Schedule info
    public static List<RegisteredSportSchedule> getRegisteredSportScheduleList(){

        List<RegisteredSportSchedule> registeredSportScheduleList = new ArrayList<>();
        String filePath = courseFile + "RegisteredSportSchedule.txt";
        List<String> schedule = readTxtFile(filePath);
        for (String ss : schedule) {
            if (ss.trim() != "" && !ss.trim().equals("")) {
                String[] ssArray = ss.split("\t");
                RegisteredSportSchedule rss = new RegisteredSportSchedule();
                rss.setStudentID(ssArray[0]);
                rss.setStudentName(ssArray[1]);
                rss.setCoachName(ssArray[2]);
                rss.setSportCode(ssArray[3]);
                rss.setSportName(ssArray[4]);
                rss.setScheduleDate(ssArray[5]);
                rss.setSportAddress(ssArray[6]);
                registeredSportScheduleList.add(rss);
            }
        }
        // print
        for (RegisteredSportSchedule registeredSportSchedule : registeredSportScheduleList) {
            System.out.println(registeredSportSchedule.toString());
        }
        return registeredSportScheduleList;
    }

    // get Schedule info by studentID
    public static List<RegisteredSportSchedule> getRegisteredSportScheduleListByStudentID(String studentID){

        List<RegisteredSportSchedule> registeredSportScheduleList = new ArrayList<>();
        String filePath = courseFile + "RegisteredSportSchedule.txt";
        List<String> schedule = readTxtFile(filePath);
        for (String ss : schedule) {
            if (ss.trim() != "" && !ss.trim().equals("")) {
                String[] ssArray = ss.split("\t");
                if (ssArray[0].equals(studentID)) {
                    RegisteredSportSchedule rss = new RegisteredSportSchedule();
                    rss.setStudentID(ssArray[0]);
                    rss.setStudentName(ssArray[1]);
                    rss.setCoachName(ssArray[2]);
                    rss.setSportCode(ssArray[3]);
                    rss.setSportName(ssArray[4]);
                    rss.setScheduleDate(ssArray[5]);
                    rss.setSportAddress(ssArray[6]);
                    registeredSportScheduleList.add(rss);
                }
            }
        }
        // print
        for (RegisteredSportSchedule registeredSportSchedule : registeredSportScheduleList) {
            System.out.println(registeredSportSchedule.toString());
        }
        return registeredSportScheduleList;
    }

    // modify student info
    public void modifyStudent(Student keyStudent, Student newValue){
//        System.out.print("please enter modify student info:");
        String filePath = courseFile + "student.txt";
        try {
            modifyTxt(filePath, keyStudent.getId(), keyStudent.getString(), newValue.getString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("modify success!");
    }

    public static List<Coach> getDetailsOfCoach(){
            // get coach info
            List<Coach> coachList = new ArrayList<Coach>();
            String filePath = rootPath+"Coach.txt";
            List<String> coachTxt = readTxtFile(filePath);
            for (String ss : coachTxt) {
                if (ss.trim() != "" && !ss.trim().equals("")) {
                    String[] ssArray = ss.split("\t");
                    Coach coach = new Coach();
                    coach.setCoachId(ssArray[0]);
                    coach.setCoachName(ssArray[1]);
                    coach.setRatePerHour(ssArray[2]);
                    coach.setCoachPhone(ssArray[4]);
                    coach.setSportCenterID(ssArray[9]);
                    coach.setSportName(ssArray[7]);
                    coach.setCoachEvaluate(ssArray[5]);
                    coach.setCoachAddress(ssArray[10]);
                    coach.setSportID(ssArray[6]);
                    coachList.add(coach);
                }
            }
            // print
            for (Coach coach : coachList) {
                System.out.println(coach.toString());
            }
            return coachList;
    }

    // add student
    public void addStudent(String studentInfo){
        String filePath = courseFile + "student.txt";
        writeFile(filePath, studentInfo);

        System.out.println("Add student success!");
    }


    /**
     * Function: Java reads the contents of the TXT file
     * Step 1: Get the file handle first
     * 2: Getting a file handle is treated as input to a bytecode stream that needs to be read
     * 3: After the input stream is read, the generated byte stream needs to be read
     * 4: Output line by line.().
     * Note: Exceptions need to be considered
     *
     * @param filePath
     */
    public static List readTxtFile(String filePath) {
        List<String> array = new ArrayList<String>();
        try {
            String encoding = "UTF-8";
            File file = new File(filePath);
            if (file.isFile() && file.exists()) { //Determine whether the file exists
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file), encoding);//Consider the encoding format
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while ((lineTxt = bufferedReader.readLine()) != null) {
//                    System.out.println(lineTxt);
                    array.add(lineTxt);
                }
                read.close();
            } else {
                System.out.println("The specified file could not be found");
            }
        } catch (Exception e) {
            System.out.println("Error reading file contents");
            e.printStackTrace();
        }
        return array;
    }

    // modify StudentTxt
    public static void modifyTxt(String filePath, String studentId, String key, String newValue) throws IOException {
        File fileText = new File(filePath);
        BufferedReader br = null;
        PrintWriter pw = null;
        StringBuffer buff = new StringBuffer();//Temporary container!
        String line = System.getProperty("line.separator");//Platform line feed!
        try {
            br = new BufferedReader(new FileReader(fileText));
            for (String str = br.readLine(); str != null; str = br.readLine()) {
                String[] ssArray = str.split(",");
                if (ssArray[0] == studentId || ssArray[0].equals(studentId)) {
                    if (str.contains(key)) {
                        str = str.replaceAll(key, newValue);
                    }
                }
                buff.append(str + line);
            }
            pw = new PrintWriter(new FileWriter(fileText), true);
            pw.println(buff);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null)
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (pw != null)
                pw.close();
        }
    }

    //

    /**
     * add row
     */
    public static boolean writeFile(String path, String body) {

        File file = new File(path);
        FileWriter fw;
        try {
            fw = new FileWriter(file, true); //True is critical. If left unfilled, the test will overwrite the original with a blank file
            fw.write(body + "\r\n");
            fw.close();
        } catch (IOException e) {
            return false;
        }
        return true;
    }

}
