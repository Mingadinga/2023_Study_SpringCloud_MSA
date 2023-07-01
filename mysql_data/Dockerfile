FROM mariadb:10.3.29
ENV MYSQL_ROOT_PASSWORD star0826
ENV MYSQL_DATABASE mydb
# COPY ./mysql_data/mysql /var/lib/mysql
COPY ./mysql-init-files /docker-entrypoint-initdb.d/
EXPOSE 3306

# ENTRYPOINT ["mysqld", "--user=root"]
