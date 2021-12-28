# commit all files in current directory
cd src
for file in *
do
    echo $file
    git add $file
    git commit -m "commit $file"
    git push
done

cd - 
cd class
for file in *
do
    echo $file
    git add $file
    git commit -m "compiled $file"
    git push
done