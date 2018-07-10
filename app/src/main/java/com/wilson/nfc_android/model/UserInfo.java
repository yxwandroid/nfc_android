package com.wilson.nfc_android.model;

public class UserInfo {

    /**
     * status : 0
     * msg : 登录成功
     * data : {"id":21,"username":"wilson","password":"0108997101B73476BB67DD975C48880E","email":"string","phone":"string","question":"string","answer":"string","role":0,"nickname":"string","uuid":"string","extra1":"string","extra2":"string","extra3":"string","headimg":"string","createTime":"2018-06-26T01:56:43.000+0000","updateTime":"2018-06-26T01:56:43.000+0000"}
     */

    private int status;
    private String msg;
    private DataBean data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 21
         * username : wilson
         * password : 0108997101B73476BB67DD975C48880E
         * email : string
         * phone : string
         * question : string
         * answer : string
         * role : 0
         * nickname : string
         * uuid : string
         * extra1 : string
         * extra2 : string
         * extra3 : string
         * headimg : string
         * createTime : 2018-06-26T01:56:43.000+0000
         * updateTime : 2018-06-26T01:56:43.000+0000
         */

        private int id;
        private String username;
        private String password;
        private String email;
        private String phone;
        private String question;
        private String answer;
        private int role;
        private String nickname;
        private String uuid;
        private String extra1;
        private String extra2;
        private String extra3;
        private String headimg;
        private String createTime;
        private String updateTime;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }

        public String getAnswer() {
            return answer;
        }

        public void setAnswer(String answer) {
            this.answer = answer;
        }

        public int getRole() {
            return role;
        }

        public void setRole(int role) {
            this.role = role;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public String getExtra1() {
            return extra1;
        }

        public void setExtra1(String extra1) {
            this.extra1 = extra1;
        }

        public String getExtra2() {
            return extra2;
        }

        public void setExtra2(String extra2) {
            this.extra2 = extra2;
        }

        public String getExtra3() {
            return extra3;
        }

        public void setExtra3(String extra3) {
            this.extra3 = extra3;
        }

        public String getHeadimg() {
            return headimg;
        }

        public void setHeadimg(String headimg) {
            this.headimg = headimg;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }
    }
}
