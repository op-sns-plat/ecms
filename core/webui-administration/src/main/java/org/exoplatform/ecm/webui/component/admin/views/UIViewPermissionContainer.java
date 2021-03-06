/***************************************************************************
 * Copyright (C) 2003-2009 eXo Platform SAS.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see<http://www.gnu.org/licenses/>.
 *
 **************************************************************************/
package org.exoplatform.ecm.webui.component.admin.views;

import org.exoplatform.ecm.webui.core.UIPermissionManagerBase;
import org.exoplatform.webui.config.annotation.ComponentConfig;
import org.exoplatform.webui.core.lifecycle.UIContainerLifecycle;

/**
 * Created by The eXo Platform SARL
 * Author : Dang Van Minh
 *          minh.dang@exoplatform.com
 * Feb 19, 2013
 * 4:30:37 PM  
 */

@ComponentConfig(lifecycle = UIContainerLifecycle.class)

public class UIViewPermissionContainer extends UIPermissionManagerBase {

  private boolean isUpdate_ = false;
  private boolean isView_ = false;
  
  public UIViewPermissionContainer() throws Exception {
    addChild(UIViewPermissionList.class, null, null);
    addChild(UIViewPermissionForm.class, null, null);
  }
  
  public void update(boolean isUpdate) {
    isUpdate_ = isUpdate;
  }
  
  public boolean isUpdate() {
    return isUpdate_;
  }
  
  public boolean isView() {
    return isView_;
  }
  
  public void view(boolean isView) {
    isView_ = isView;
  }   
}
