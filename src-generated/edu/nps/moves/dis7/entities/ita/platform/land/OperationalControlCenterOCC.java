package edu.nps.moves.dis7.entities.ita.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@25bc0606;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 18299
 */
public class OperationalControlCenterOCC extends EntityType
{
    /** Default constructor */
    public OperationalControlCenterOCC()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 18296, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 18297, SPADA SAM System
        setSpecific((byte)1); // uid 18298, Detection Center (DC)
        setExtra((byte)1); // uid 18299, Operational Control Center (OCC)
    }
}
