import {Component, ViewChild, ElementRef, Input} from '@angular/core';
import {Student} from '../student';
import {Router} from "@angular/router";
import {StudentsDataService} from "../../service/students-data.service";

@Component({
 selector: 'students-add',
 templateUrl: 'app/students/add/students.add.component.html',
 styleUrls:['app/students/add/students.add.component.css']
})
export class StudentsAddComponent {
	student: any= {};
  constructor (private studentDataService:StudentsDataService, private router: Router){};

  ngOnInit(){
    this.student = new Student();
  }

	upQuantity(student:Student){
		student.penAmount++;
	}

	downQuantity(student:Student){
		if (student.penAmount >0)
			student.penAmount--;
	}

	@ViewChild('fileInput') inputEl: ElementRef
	addStudent(student:Student){
    let result: Student;
	  console.log(student)
    let inputEl: HTMLInputElement = this.inputEl.nativeElement;

	  this.studentDataService.addStudent(student, inputEl.files.item(0)).subscribe(resultStudent => {
	    result = resultStudent
      if(result != null) {
        this.router.navigate(['/list']);
      }
      else {
	      alert("Error in adding the student")
      }
    })
  }

  onFileChange(event,student:any){
    var filename= event.target.files[0].name;
    console.log(filename);
    student.image=filename;
  }
}
