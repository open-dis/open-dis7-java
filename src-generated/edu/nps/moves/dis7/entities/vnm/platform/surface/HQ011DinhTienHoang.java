package edu.nps.moves.dis7.entities.vnm.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5b29ab61;
 * Country: Viet Nam (VNM);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28604
 */
public class HQ011DinhTienHoang extends EntityType
{
    /** Default constructor */
    public HQ011DinhTienHoang()
    {
        setCountry(Country.VIET_NAM_VNM);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 28602, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 28603, Gepard 3.9 Class
        setSpecific((byte)1); // uid 28604, HQ-011 Dinh Tien Hoang
    }
}
