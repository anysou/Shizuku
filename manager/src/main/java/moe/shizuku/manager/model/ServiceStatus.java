package moe.shizuku.manager.model;

import moe.shizuku.api.ShizukuService;
import moe.shizuku.manager.legacy.ShizukuLegacy;

public class ServiceStatus {

    private ShizukuLegacy.ShizukuState v2Status = ShizukuLegacy.ShizukuState.createUnknown();
    private int uid;
    private int version;
    private String secontext;

    public ServiceStatus() {
    }

    public ShizukuLegacy.ShizukuState getV2Status() {
        return v2Status;
    }

    public void setV2Status(ShizukuLegacy.ShizukuState v2Status) {
        this.v2Status = v2Status;
    }

    public boolean isV3Running() {
        return ShizukuService.pingBinder();
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getSEContext() {
        return secontext;
    }

    public void setSEContext(String secontext) {
        this.secontext = secontext;
    }
}
