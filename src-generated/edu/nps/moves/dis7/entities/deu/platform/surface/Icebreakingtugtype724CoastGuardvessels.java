package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@74a6f9c1;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16682
 */
public class Icebreakingtugtype724CoastGuardvessels extends EntityType
{
    /** Default constructor */
    public Icebreakingtugtype724CoastGuardvessels()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 16659, Auxiliary, Merchant Marine
        setSubCategory((byte)4); // uid 16682, Icebreaking tug (type 724; Coast Guard vessels)
    }
}
