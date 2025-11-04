FROM alpine
RUN apk add nginx
# RUN nginx
CMD ["nginx", "-g", "daemon off;"]
EXPOSE 80
#COPY C:\Users\kille\17349\despliegue \var\lib\nginx\html
COPY ./despliegue /var/lib/nginx/html
COPY ./yael.conf /etc/nginx/http.d/default.conf