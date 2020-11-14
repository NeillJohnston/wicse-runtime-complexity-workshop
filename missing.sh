rm -r test
mkdir test
rm -r subs
mkdir subs
python3 generate_missing.py
taskset -c 3 python3 run.py $1 missing