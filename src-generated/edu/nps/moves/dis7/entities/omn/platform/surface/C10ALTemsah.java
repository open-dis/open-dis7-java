package edu.nps.moves.dis7.entities.omn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7674a051
 * Country: Oman (OMN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 17966
 */
public class C10ALTemsah extends EntityType
{
    public C10ALTemsah()
    {
        setCountry(Country.OMAN_OMN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 17962, Landing Craft
        setSubCategory((byte)1); // uid 17963, LCM
        setSpecific((byte)3); // uid 17966, C10 AL Temsah
    }
}
