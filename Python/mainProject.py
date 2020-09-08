class Project:
    project_id=""
    project_name=""

    def __init__(self,project_id,project_name):
        self.project_id=project_id
        self.project_name=project_name



class Module(Project):
    module_name=""
    def __init__(self,module_name,project_id,project_name):
        self.module_name=module_name
        super().__init__(project_id,project_name)


class Task(Module):
    task_name=""
    def __init__(self,task_name,module_name,project_id,project_name):
        self.task_name=task_name
        super().__init__(module_name,project_id,project_name)

    def display(self):
        print("Project Id:"+self.project_id)
        print("Project Name:"+self.project_name)
        print("Module Name:"+self.module_name)
        print("Task Name:"+self.task_name)

project_id =input("Enter Project id:")
project_name =input("Enter Project name:")
module_name= input("Enter Module name:")
task_name =input("Enter Task name:")
task_obj=Task(task_name,module_name,project_id,project_name)
task_obj.display()
