if [ -z "&(ls -A ./bin)" ]; then 
	mkdir ./bin
fi

javac -sourcepath ./src -d ./bin src/main/FocusStartApplication.java
