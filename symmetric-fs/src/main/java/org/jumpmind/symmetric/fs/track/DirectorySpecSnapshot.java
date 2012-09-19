/*
 * Licensed to JumpMind Inc under one or more contributor 
 * license agreements.  See the NOTICE file distributed
 * with this work for additional information regarding 
 * copyright ownership.  JumpMind Inc licenses this file
 * to you under the GNU Lesser General Public License (the
 * "License"); you may not use this file except in compliance
 * with the License. 
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see           
 * <http://www.gnu.org/licenses/>.
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License. 
 */
package org.jumpmind.symmetric.fs.track;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jumpmind.symmetric.fs.config.DirectorySpec;

public class DirectorySpecSnapshot {

    protected Date fromDate;
    protected Date toDate;
    protected String nodeId;
    protected DirectorySpec directorySpec;
    protected List<FileChange> files = new ArrayList<FileChange>();

    public DirectorySpecSnapshot(String nodeId, DirectorySpec directorySpec) {
        this.fromDate = new Date();
        this.nodeId = nodeId;
        this.directorySpec = directorySpec;
    }
    
    public DirectorySpec getDirectorySpec() {
        return directorySpec;
    }
    
    public List<FileChange> getFiles() {
        return files;
    }
    
    public void addFileChange(FileChange fileChange) {
        files.add(fileChange);
    }

    protected void merge(DirectorySpecSnapshot snapshot) {

    }
    
    protected DirectorySpecSnapshot diff(DirectorySpecSnapshot snapshot) {
        return null;
    }

}
