if [ -z "&(ls -A ./bin)" ]; then 
	bash compile.sh
fi
java -cp bin main.FocusStartApplication in.txt out.txt
