package com.zhongxia.tree;
import java.util.ArrayList;
import java.util.List;
public class PathSum113 {
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
    }
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

            List<List<Integer>> paths = new ArrayList<List<Integer>>();
            go(root, 0, sum, new ArrayList<Integer>(), paths);
            return paths;
        }

        void go(TreeNode node,int sum,int target,ArrayList<Integer> path,List<List<Integer>> paths){
            if(node==null)
                return;
            //相当于根操作累加sum
            sum+=node.val;
            //加入栈中
            path.add(node.val);
            //如果为叶子节点，sum=target，加入结果栈
            if(sum==target&&node.left==null&&node.right==null){
                paths.add(new ArrayList<Integer>(path));
            }else{
                //递归
                go(node.left,sum,target,path,paths);
                go(node.right,sum,target,path,paths);
            }
            //回溯到上一级，然后把加入的删除，remove掉
            sum-=node.val;
            path.remove(path.size()-1);
        }
    }

