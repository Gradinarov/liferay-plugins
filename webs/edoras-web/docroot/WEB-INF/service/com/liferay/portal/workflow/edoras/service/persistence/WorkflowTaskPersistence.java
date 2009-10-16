/**
 * Copyright (c) 2000-2009 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portal.workflow.edoras.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * <a href="WorkflowTaskPersistence.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 */
public interface WorkflowTaskPersistence extends BasePersistence {
	public void cacheResult(
		com.liferay.portal.workflow.edoras.model.WorkflowTask workflowTask);

	public void cacheResult(
		java.util.List<com.liferay.portal.workflow.edoras.model.WorkflowTask> workflowTasks);

	public void clearCache();

	public com.liferay.portal.workflow.edoras.model.WorkflowTask create(
		long workflowTaskId);

	public com.liferay.portal.workflow.edoras.model.WorkflowTask remove(
		long workflowTaskId)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.workflow.edoras.NoSuchWorkflowTaskException;

	public com.liferay.portal.workflow.edoras.model.WorkflowTask remove(
		com.liferay.portal.workflow.edoras.model.WorkflowTask workflowTask)
		throws com.liferay.portal.SystemException;

	public com.liferay.portal.workflow.edoras.model.WorkflowTask update(
		com.liferay.portal.workflow.edoras.model.WorkflowTask workflowTask)
		throws com.liferay.portal.SystemException;

	public com.liferay.portal.workflow.edoras.model.WorkflowTask update(
		com.liferay.portal.workflow.edoras.model.WorkflowTask workflowTask,
		boolean merge) throws com.liferay.portal.SystemException;

	public com.liferay.portal.workflow.edoras.model.WorkflowTask updateImpl(
		com.liferay.portal.workflow.edoras.model.WorkflowTask workflowTask,
		boolean merge) throws com.liferay.portal.SystemException;

	public com.liferay.portal.workflow.edoras.model.WorkflowTask findByPrimaryKey(
		long workflowTaskId)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.workflow.edoras.NoSuchWorkflowTaskException;

	public com.liferay.portal.workflow.edoras.model.WorkflowTask fetchByPrimaryKey(
		long workflowTaskId) throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portal.workflow.edoras.model.WorkflowTask> findByWorkflowInstanceId(
		long workflowInstanceId) throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portal.workflow.edoras.model.WorkflowTask> findByWorkflowInstanceId(
		long workflowInstanceId, int start, int end)
		throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portal.workflow.edoras.model.WorkflowTask> findByWorkflowInstanceId(
		long workflowInstanceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException;

	public com.liferay.portal.workflow.edoras.model.WorkflowTask findByWorkflowInstanceId_First(
		long workflowInstanceId,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.workflow.edoras.NoSuchWorkflowTaskException;

	public com.liferay.portal.workflow.edoras.model.WorkflowTask findByWorkflowInstanceId_Last(
		long workflowInstanceId,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.workflow.edoras.NoSuchWorkflowTaskException;

	public com.liferay.portal.workflow.edoras.model.WorkflowTask[] findByWorkflowInstanceId_PrevAndNext(
		long workflowTaskId, long workflowInstanceId,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.workflow.edoras.NoSuchWorkflowTaskException;

	public java.util.List<com.liferay.portal.workflow.edoras.model.WorkflowTask> findByCompleted(
		boolean completed) throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portal.workflow.edoras.model.WorkflowTask> findByCompleted(
		boolean completed, int start, int end)
		throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portal.workflow.edoras.model.WorkflowTask> findByCompleted(
		boolean completed, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException;

	public com.liferay.portal.workflow.edoras.model.WorkflowTask findByCompleted_First(
		boolean completed, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.workflow.edoras.NoSuchWorkflowTaskException;

	public com.liferay.portal.workflow.edoras.model.WorkflowTask findByCompleted_Last(
		boolean completed, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.workflow.edoras.NoSuchWorkflowTaskException;

	public com.liferay.portal.workflow.edoras.model.WorkflowTask[] findByCompleted_PrevAndNext(
		long workflowTaskId, boolean completed,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.workflow.edoras.NoSuchWorkflowTaskException;

	public java.util.List<com.liferay.portal.workflow.edoras.model.WorkflowTask> findByC_C(
		long companyId, boolean completed)
		throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portal.workflow.edoras.model.WorkflowTask> findByC_C(
		long companyId, boolean completed, int start, int end)
		throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portal.workflow.edoras.model.WorkflowTask> findByC_C(
		long companyId, boolean completed, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException;

	public com.liferay.portal.workflow.edoras.model.WorkflowTask findByC_C_First(
		long companyId, boolean completed,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.workflow.edoras.NoSuchWorkflowTaskException;

	public com.liferay.portal.workflow.edoras.model.WorkflowTask findByC_C_Last(
		long companyId, boolean completed,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.workflow.edoras.NoSuchWorkflowTaskException;

	public com.liferay.portal.workflow.edoras.model.WorkflowTask[] findByC_C_PrevAndNext(
		long workflowTaskId, long companyId, boolean completed,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.workflow.edoras.NoSuchWorkflowTaskException;

	public java.util.List<com.liferay.portal.workflow.edoras.model.WorkflowTask> findByW_S(
		long workflowInstanceId, int state)
		throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portal.workflow.edoras.model.WorkflowTask> findByW_S(
		long workflowInstanceId, int state, int start, int end)
		throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portal.workflow.edoras.model.WorkflowTask> findByW_S(
		long workflowInstanceId, int state, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException;

	public com.liferay.portal.workflow.edoras.model.WorkflowTask findByW_S_First(
		long workflowInstanceId, int state,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.workflow.edoras.NoSuchWorkflowTaskException;

	public com.liferay.portal.workflow.edoras.model.WorkflowTask findByW_S_Last(
		long workflowInstanceId, int state,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.workflow.edoras.NoSuchWorkflowTaskException;

	public com.liferay.portal.workflow.edoras.model.WorkflowTask[] findByW_S_PrevAndNext(
		long workflowTaskId, long workflowInstanceId, int state,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.workflow.edoras.NoSuchWorkflowTaskException;

	public java.util.List<Object> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.SystemException;

	public java.util.List<Object> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portal.workflow.edoras.model.WorkflowTask> findAll()
		throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portal.workflow.edoras.model.WorkflowTask> findAll(
		int start, int end) throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portal.workflow.edoras.model.WorkflowTask> findAll(
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException;

	public void removeByWorkflowInstanceId(long workflowInstanceId)
		throws com.liferay.portal.SystemException;

	public void removeByCompleted(boolean completed)
		throws com.liferay.portal.SystemException;

	public void removeByC_C(long companyId, boolean completed)
		throws com.liferay.portal.SystemException;

	public void removeByW_S(long workflowInstanceId, int state)
		throws com.liferay.portal.SystemException;

	public void removeAll() throws com.liferay.portal.SystemException;

	public int countByWorkflowInstanceId(long workflowInstanceId)
		throws com.liferay.portal.SystemException;

	public int countByCompleted(boolean completed)
		throws com.liferay.portal.SystemException;

	public int countByC_C(long companyId, boolean completed)
		throws com.liferay.portal.SystemException;

	public int countByW_S(long workflowInstanceId, int state)
		throws com.liferay.portal.SystemException;

	public int countAll() throws com.liferay.portal.SystemException;
}