import csv
import re
with open('book1.csv','r') as file:
        data=csv.DictReader(file)
        rows=0
        scoresdict={}
        for r in data:
            years=r['MatchDate']
            scores=r['runs']
            years=years.split('-')
            years=years[2]
            if years not in scoresdict.keys():
                scoresdict[years]=int(scores)
            elif years in scoresdict.keys():
                new={}
                new[years]=scoresdict.get(years)+int(scores)
                scoresdict.update(new)

        for k in scoresdict.keys():
            print(k,scoresdict.get(k))





