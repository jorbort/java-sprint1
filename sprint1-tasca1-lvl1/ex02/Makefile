COMPILER= javac

all:
	find * -name "*.java" > sources.txt
	$(COMPILER) @sources.txt

clean:
	rm -f *.class

re: clean all
