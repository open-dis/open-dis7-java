package edu.nps.moves.dis7.entities.gbr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7f37b6d9;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 15071
 */
public class TornadoGRMk1wreconpod extends EntityType
{
    /** Default constructor */
    public TornadoGRMk1wreconpod()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)7); // uid 15064, Reconnaissance
        setSubCategory((byte)3); // uid 15070, Tornado
        setSpecific((byte)1); // uid 15071, Tornado GR Mk 1 w/recon pod
    }
}
