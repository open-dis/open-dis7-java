package edu.nps.moves.dis7.entities.can.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@31aab981;
 * Country: Canada (CAN);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 21772
 */
public class CRV7M261HEMPSMHighExplosiveMultipurposeSubmunition extends EntityType
{
    /** Default constructor */
    public CRV7M261HEMPSMHighExplosiveMultipurposeSubmunition()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 21760, Ballistic
        setSubCategory((byte)1); // uid 21761, 70 mm(2.75in)
        setSpecific((byte)11); // uid 21772, CRV7 M261 HE MPSM: High Explosive Multipurpose Submunition
    }
}
