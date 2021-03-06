package edu.nps.moves.dis7.entities.can.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1ed4004b;
 * Country: Canada (CAN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31196
 */
public class MTVLBasicPersonnelCarrierLightResupply extends EntityType
{
    /** Default constructor */
    public MTVLBasicPersonnelCarrierLightResupply()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 30991, Armored Fighting Vehicle
        setSubCategory((byte)3); // uid 31195, M113A3 / Mobile Tactical Vehicle Light (MTVL)
        setSpecific((byte)1); // uid 31196, MTVL Basic Personnel Carrier / Light Re-supply
    }
}
