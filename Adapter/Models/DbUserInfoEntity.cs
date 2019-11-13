using System;
using homework_4.ModelsInterfaces;

namespace homework_4.Models
{
    public class DbUserInfoEntity : IDbEntity
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public DateTime Birthday { get; set; }
    }
}
