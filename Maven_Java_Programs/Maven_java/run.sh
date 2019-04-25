CLASSPATH=

for f in target/*.jar; do
    CLASSPATH=${CLASSPATH}:$f;
done

for f in target/lib/*.jar; do
    CLASSPATH=${CLASSPATH}:$f;
done

MAINCLASS=com.kritter.DatabaseTest

echo java  -cp "$CLASSPATH" $MAINCLASS
eval java  -cp "$CLASSPATH" $MAINCLASS

