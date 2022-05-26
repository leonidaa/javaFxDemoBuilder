 /etc/init.d/oracle-xe stop
dpkg --purge oracle-xe
rm -r /u01/app
rm /etc/default/oracle-xe

update-rc.d -f oracle-xe remove
update-rc.d -f oracle-mount remove
update-rc.d -f oracle-shm remove