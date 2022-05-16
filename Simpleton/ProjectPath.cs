using System;
using System.IO;

namespace Simpleton
{
    public class ProjectPath
    {
        public ProjectPath() {
            string[] projectFolders = Directory.GetCurrentDirectory().Split("/");
            string tempPath = "";
            foreach(string folder in projectFolders) {
                tempPath += folder + "/";
                if(folder == "P4") {
                    tempPath += "Simpleton/";
                    break;
                }
                    
            }
            _path = tempPath;
        }

        public string GetPath() {
            return _path;
        }

        string _path;
    }
}