**Title: Rope**

Rope is is efficient data structure for very large strings. 

The theoretical basis on Rope data structure is explained in details in [Wikipedia](https://en.wikipedia.org/wiki/Rope_(data_structure)).It is a weighted binary tree structure, in which all leafs contain strings with different length. The lenght of these strings form the weight of every leaf. Every parent node has a weight value equal to the length of its string plus the sum of all leaf nodes' weight in its left subtree. 

The goal of this project is to realize rope and check via its main operations its advantages and disadvantags 
under different inputs. 

The project include use of graphical interface in Java. 

At this stage the rope is programmed using two classes, RopeNode and Rope. 
Main operations of inserting, substring, print and indexOf are realized. 

The class diagram is presented here: 

![Class Diagram](https://github.com/noykova/Rope/blob/master/ClassDiagramRopeVersion1.jpg)


**Name**: Neli Noykova, Department of Computer Science





