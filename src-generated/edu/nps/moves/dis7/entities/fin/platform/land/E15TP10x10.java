package edu.nps.moves.dis7.entities.fin.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@63475ace;
 * Country: Finland (FIN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 29948
 */
public class E15TP10x10 extends EntityType
{
    /** Default constructor */
    public E15TP10x10()
    {
        setCountry(Country.FINLAND_FIN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 27629, Armored Utility Vehicle
        setSubCategory((byte)3); // uid 29945, SISU E13TP/E15TP Military Terrain Lorry
        setSpecific((byte)3); // uid 29948, E15TP 10x10
    }
}
