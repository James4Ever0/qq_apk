package com.tencent.mobileqq.statistics;

import java.util.ArrayList;
import java.util.List;

public class FDStatsTree
{
  int jdField_a_of_type_Int = 0;
  FDStatsTree.TreeNode jdField_a_of_type_ComTencentMobileqqStatisticsFDStatsTree$TreeNode = new FDStatsTree.TreeNode(this.jdField_a_of_type_Int, '&');
  List jdField_a_of_type_JavaUtilList = new ArrayList();
  
  public FDStatsTree()
  {
    this.jdField_a_of_type_Int += 1;
  }
  
  public void a(String paramString)
  {
    Object localObject = this.jdField_a_of_type_ComTencentMobileqqStatisticsFDStatsTree$TreeNode;
    int i = 0;
    if (i < paramString.length())
    {
      char c = paramString.charAt(i);
      FDStatsTree.TreeNode localTreeNode = ((FDStatsTree.TreeNode)localObject).a(c);
      if (localTreeNode == null)
      {
        localTreeNode = new FDStatsTree.TreeNode(this.jdField_a_of_type_Int, c);
        this.jdField_a_of_type_Int += 1;
        ((FDStatsTree.TreeNode)localObject).a(localTreeNode);
      }
      for (localObject = localTreeNode;; localObject = localTreeNode)
      {
        i += 1;
        break;
        localTreeNode.a();
      }
    }
  }
}


/* Location:           L:\local\mybackup\temp\qq_apk\com.tencent.mobileqq\classes2.jar
 * Qualified Name:     com.tencent.mobileqq.statistics.FDStatsTree
 * JD-Core Version:    0.7.0.1
 */