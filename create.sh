#/bin/bash

if [ $1 -eq "1" ]; then
    type="One"
elif [ $1 -eq "2" ]; then
    type="Two"
elif [ $1 -eq "3" ]; then
    type="Three"
elif [ $1 -eq "4" ]; then
    type="Four"
else
    echo "invalid file type requested"
fi

touch $2.txt
cp $type.java tmp
cat tmp | sed -e "s/$type/$2/g" > $2.java
rm tmp