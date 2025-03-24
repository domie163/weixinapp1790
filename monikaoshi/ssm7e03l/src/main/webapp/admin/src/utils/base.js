const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm7e03l/",
            name: "ssm7e03l",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm7e03l/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "模拟考试"
        } 
    }
}
export default base
