import jenkins.model.*

Jenkins.instance.setNumExecutors(2)

dis = new hudson.model.JDK.DescriptorImpl();
dis.setInstallations(new hudson.model.JDK("OpenJDK8", "/usr/lib/jvm/java-8-openjdk-amd64"));

a = Jenkins.instance.getExtensionList(hudson.tasks.Maven.DescriptorImpl.class)[0];
b = (a.installations as List);
b.add(new hudson.tasks.Maven.MavenInstallation("MAVEN3", "/usr/share/maven", []));
a.installations = b
a.save()

