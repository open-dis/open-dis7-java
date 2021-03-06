package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@c05fddc;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 22717
 */
public class Leopard1A5Observer extends EntityType
{
    /** Default constructor */
    public Leopard1A5Observer()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 16240, Tank
        setSubCategory((byte)1); // uid 16241, Leopard 1 MBT
        setSpecific((byte)6); // uid 22717, Leopard 1 A5 Observer
    }
}
