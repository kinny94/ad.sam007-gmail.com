class SubTreeOfAnotherTree {

    public boolean isSubTree(TreeNode s, TreeNode t) {
        
        if (s == null) {
            return false;
        } else if (isSameTree(s, t)) {
            return true;
        } else {
            return isSubTree(s.left, t) || isSubTree(s.right, t);
        }
    }

    public boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null || t== null) {
            return s == null & t == null;
        } else if (s.val == t.val) {
            return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
        } else {
            return false;
        }
    }
}